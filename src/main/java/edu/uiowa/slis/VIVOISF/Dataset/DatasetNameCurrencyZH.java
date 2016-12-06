package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetNameCurrencyZHIterator theDataset = (DatasetNameCurrencyZHIterator)findAncestorWithClass(this, DatasetNameCurrencyZHIterator.class);
			pageContext.getOut().print(theDataset.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

