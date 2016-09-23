package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaSameAs extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaSameAs currentInstance = null;
	private static final Log log = LogFactory.getLog(areaSameAs.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaSameAsIterator thearea = (areaSameAsIterator)findAncestorWithClass(this, areaSameAsIterator.class);
			pageContext.getOut().print(thearea.getSameAs());
		} catch (Exception e) {
			log.error("Can't find enclosing area for sameAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for sameAs tag ");
		}
		return SKIP_BODY;
	}
}

