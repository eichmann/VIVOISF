package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingNameShortFRIterator theSelf_governing = (Self_governingNameShortFRIterator)findAncestorWithClass(this, Self_governingNameShortFRIterator.class);
			pageContext.getOut().print(theSelf_governing.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

