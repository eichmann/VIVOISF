package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetNameCurrencyFRIterator theDataset = (DatasetNameCurrencyFRIterator)findAncestorWithClass(this, DatasetNameCurrencyFRIterator.class);
			pageContext.getOut().print(theDataset.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

