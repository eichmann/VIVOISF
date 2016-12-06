package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetNameCurrencyESIterator theDataset = (DatasetNameCurrencyESIterator)findAncestorWithClass(this, DatasetNameCurrencyESIterator.class);
			pageContext.getOut().print(theDataset.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

