package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingNameOfficialFRIterator theSelf_governing = (Self_governingNameOfficialFRIterator)findAncestorWithClass(this, Self_governingNameOfficialFRIterator.class);
			pageContext.getOut().print(theSelf_governing.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

