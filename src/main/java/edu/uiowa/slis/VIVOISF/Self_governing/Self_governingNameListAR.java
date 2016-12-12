package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingNameListARIterator theSelf_governing = (Self_governingNameListARIterator)findAncestorWithClass(this, Self_governingNameListARIterator.class);
			pageContext.getOut().print(theSelf_governing.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

