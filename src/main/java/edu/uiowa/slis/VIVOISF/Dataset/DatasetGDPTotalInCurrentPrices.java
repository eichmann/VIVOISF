package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetGDPTotalInCurrentPricesIterator theDataset = (DatasetGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, DatasetGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(theDataset.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

