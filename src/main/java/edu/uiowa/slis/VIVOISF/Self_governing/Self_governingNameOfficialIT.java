package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingNameOfficialITIterator theSelf_governing = (Self_governingNameOfficialITIterator)findAncestorWithClass(this, Self_governingNameOfficialITIterator.class);
			pageContext.getOut().print(theSelf_governing.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

