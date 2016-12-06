package edu.uiowa.slis.VIVOISF.IAO_0000003;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000003NameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000003NameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000003NameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000003NameCurrencyENIterator theIAO_0000003 = (IAO_0000003NameCurrencyENIterator)findAncestorWithClass(this, IAO_0000003NameCurrencyENIterator.class);
			pageContext.getOut().print(theIAO_0000003.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000003 for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000003 for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

