package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(areaNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaNameOfficialZHIterator thearea = (areaNameOfficialZHIterator)findAncestorWithClass(this, areaNameOfficialZHIterator.class);
			pageContext.getOut().print(thearea.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing area for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

