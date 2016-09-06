package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingNameOfficialENIterator theself_governing = (self_governingNameOfficialENIterator)findAncestorWithClass(this, self_governingNameOfficialENIterator.class);
			pageContext.getOut().print(theself_governing.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

