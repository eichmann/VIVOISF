package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetNameCurrencyITIterator theDataset = (DatasetNameCurrencyITIterator)findAncestorWithClass(this, DatasetNameCurrencyITIterator.class);
			pageContext.getOut().print(theDataset.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

