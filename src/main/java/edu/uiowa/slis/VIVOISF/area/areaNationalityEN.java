package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(areaNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaNationalityENIterator thearea = (areaNationalityENIterator)findAncestorWithClass(this, areaNationalityENIterator.class);
			pageContext.getOut().print(thearea.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing area for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

