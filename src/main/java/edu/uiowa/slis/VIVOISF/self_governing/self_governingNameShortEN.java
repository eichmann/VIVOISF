package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingNameShortENIterator theself_governing = (self_governingNameShortENIterator)findAncestorWithClass(this, self_governingNameShortENIterator.class);
			pageContext.getOut().print(theself_governing.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

