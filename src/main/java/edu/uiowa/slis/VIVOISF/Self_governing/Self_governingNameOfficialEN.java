package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingNameOfficialENIterator theSelf_governing = (Self_governingNameOfficialENIterator)findAncestorWithClass(this, Self_governingNameOfficialENIterator.class);
			pageContext.getOut().print(theSelf_governing.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

