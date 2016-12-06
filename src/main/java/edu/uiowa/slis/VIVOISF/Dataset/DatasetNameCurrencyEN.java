package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetNameCurrencyENIterator theDataset = (DatasetNameCurrencyENIterator)findAncestorWithClass(this, DatasetNameCurrencyENIterator.class);
			pageContext.getOut().print(theDataset.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

