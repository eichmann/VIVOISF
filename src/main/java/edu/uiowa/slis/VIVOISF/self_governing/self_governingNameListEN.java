package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingNameListENIterator theself_governing = (self_governingNameListENIterator)findAncestorWithClass(this, self_governingNameListENIterator.class);
			pageContext.getOut().print(theself_governing.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

