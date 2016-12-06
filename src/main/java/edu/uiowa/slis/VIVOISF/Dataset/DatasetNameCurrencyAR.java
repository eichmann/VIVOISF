package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetNameCurrencyARIterator theDataset = (DatasetNameCurrencyARIterator)findAncestorWithClass(this, DatasetNameCurrencyARIterator.class);
			pageContext.getOut().print(theDataset.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

