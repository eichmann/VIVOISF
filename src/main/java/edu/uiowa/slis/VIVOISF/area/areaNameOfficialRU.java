package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(areaNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaNameOfficialRUIterator thearea = (areaNameOfficialRUIterator)findAncestorWithClass(this, areaNameOfficialRUIterator.class);
			pageContext.getOut().print(thearea.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing area for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

