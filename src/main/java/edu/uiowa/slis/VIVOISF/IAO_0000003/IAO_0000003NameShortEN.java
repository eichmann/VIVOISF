package edu.uiowa.slis.VIVOISF.IAO_0000003;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000003NameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000003NameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000003NameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000003NameShortENIterator theIAO_0000003 = (IAO_0000003NameShortENIterator)findAncestorWithClass(this, IAO_0000003NameShortENIterator.class);
			pageContext.getOut().print(theIAO_0000003.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000003 for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000003 for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

