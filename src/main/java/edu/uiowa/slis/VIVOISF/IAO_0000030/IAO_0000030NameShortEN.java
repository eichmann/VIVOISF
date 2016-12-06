package edu.uiowa.slis.VIVOISF.IAO_0000030;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000030NameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000030NameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000030NameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000030NameShortENIterator theIAO_0000030 = (IAO_0000030NameShortENIterator)findAncestorWithClass(this, IAO_0000030NameShortENIterator.class);
			pageContext.getOut().print(theIAO_0000030.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000030 for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000030 for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

