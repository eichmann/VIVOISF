package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingNameOfficialESIterator theSelf_governing = (Self_governingNameOfficialESIterator)findAncestorWithClass(this, Self_governingNameOfficialESIterator.class);
			pageContext.getOut().print(theSelf_governing.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

