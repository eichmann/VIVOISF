package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(areaNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaNameOfficialARIterator thearea = (areaNameOfficialARIterator)findAncestorWithClass(this, areaNameOfficialARIterator.class);
			pageContext.getOut().print(thearea.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing area for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

