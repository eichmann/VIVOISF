package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingNameOfficialARIterator theSelf_governing = (Self_governingNameOfficialARIterator)findAncestorWithClass(this, Self_governingNameOfficialARIterator.class);
			pageContext.getOut().print(theSelf_governing.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

