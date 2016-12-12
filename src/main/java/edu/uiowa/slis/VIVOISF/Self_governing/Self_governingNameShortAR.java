package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingNameShortARIterator theSelf_governing = (Self_governingNameShortARIterator)findAncestorWithClass(this, Self_governingNameShortARIterator.class);
			pageContext.getOut().print(theSelf_governing.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

