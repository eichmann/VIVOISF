package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaHasOfficialName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaHasOfficialName currentInstance = null;
	private static final Log log = LogFactory.getLog(areaHasOfficialName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaHasOfficialNameIterator thearea = (areaHasOfficialNameIterator)findAncestorWithClass(this, areaHasOfficialNameIterator.class);
			pageContext.getOut().print(thearea.getHasOfficialName());
		} catch (Exception e) {
			log.error("Can't find enclosing area for hasOfficialName tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for hasOfficialName tag ");
		}
		return SKIP_BODY;
	}
}

