package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingNameOfficialRUIterator theSelf_governing = (Self_governingNameOfficialRUIterator)findAncestorWithClass(this, Self_governingNameOfficialRUIterator.class);
			pageContext.getOut().print(theSelf_governing.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

