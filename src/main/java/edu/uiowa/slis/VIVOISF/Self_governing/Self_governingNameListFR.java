package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingNameListFRIterator theSelf_governing = (Self_governingNameListFRIterator)findAncestorWithClass(this, Self_governingNameListFRIterator.class);
			pageContext.getOut().print(theSelf_governing.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

