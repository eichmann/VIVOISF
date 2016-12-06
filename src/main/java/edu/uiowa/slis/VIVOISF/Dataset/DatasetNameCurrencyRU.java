package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetNameCurrencyRUIterator theDataset = (DatasetNameCurrencyRUIterator)findAncestorWithClass(this, DatasetNameCurrencyRUIterator.class);
			pageContext.getOut().print(theDataset.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

