package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(areaNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaNameOfficialESIterator thearea = (areaNameOfficialESIterator)findAncestorWithClass(this, areaNameOfficialESIterator.class);
			pageContext.getOut().print(thearea.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing area for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

