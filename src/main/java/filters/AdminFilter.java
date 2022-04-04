package filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lisaj
 */
public class AdminFilter implements Filter 
{    
    /**
     *
     * @param request The servlet request we are processing
     * @param response The servlet response we are creating
     * @param chain The filter chain we are processing
     *
     * @exception IOException if an input/output error occurs
     * @exception ServletException if a servlet error occurs
     */
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException 
    {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httResponse = (HttpServletResponse) response;

// check if user is an admin or not
// if admin: 
        chain.doFilter(request, response);
//if not admin send:
        httResponse.sendRedirect("/notes");

    }

    /**
     * Destroy method for this filter
     */
    public void destroy() 
    {
        
    }

    /**
     * Init method for this filter
     */
    public void init(FilterConfig filterConfig)
    {        
        
    }
}
