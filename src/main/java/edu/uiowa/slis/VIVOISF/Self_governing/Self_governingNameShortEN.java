package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingNameShortENIterator theSelf_governing = (Self_governingNameShortENIterator)findAncestorWithClass(this, Self_governingNameShortENIterator.class);
			pageContext.getOut().print(theSelf_governing.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

