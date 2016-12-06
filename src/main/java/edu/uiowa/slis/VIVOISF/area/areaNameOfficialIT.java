package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(areaNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaNameOfficialITIterator thearea = (areaNameOfficialITIterator)findAncestorWithClass(this, areaNameOfficialITIterator.class);
			pageContext.getOut().print(thearea.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing area for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

