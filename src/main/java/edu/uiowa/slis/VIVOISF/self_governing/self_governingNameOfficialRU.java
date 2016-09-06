package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingNameOfficialRUIterator theself_governing = (self_governingNameOfficialRUIterator)findAncestorWithClass(this, self_governingNameOfficialRUIterator.class);
			pageContext.getOut().print(theself_governing.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

