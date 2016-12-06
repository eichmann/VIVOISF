package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetCodeCurrencyIterator theDataset = (DatasetCodeCurrencyIterator)findAncestorWithClass(this, DatasetCodeCurrencyIterator.class);
			pageContext.getOut().print(theDataset.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

