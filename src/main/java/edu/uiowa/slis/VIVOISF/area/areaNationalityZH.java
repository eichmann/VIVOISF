package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(areaNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaNationalityZHIterator thearea = (areaNationalityZHIterator)findAncestorWithClass(this, areaNationalityZHIterator.class);
			pageContext.getOut().print(thearea.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing area for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

