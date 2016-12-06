package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(areaNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaNameShortITIterator thearea = (areaNameShortITIterator)findAncestorWithClass(this, areaNameShortITIterator.class);
			pageContext.getOut().print(thearea.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing area for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

