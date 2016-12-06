package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(areaNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaNameOfficialFRIterator thearea = (areaNameOfficialFRIterator)findAncestorWithClass(this, areaNameOfficialFRIterator.class);
			pageContext.getOut().print(thearea.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing area for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

