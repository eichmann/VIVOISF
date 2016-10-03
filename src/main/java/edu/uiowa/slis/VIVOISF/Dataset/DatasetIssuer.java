package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetIssuerIterator theDatasetIssuerIterator = (DatasetIssuerIterator)findAncestorWithClass(this, DatasetIssuerIterator.class);
			pageContext.getOut().print(theDatasetIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for issuer tag ");
		}
		return SKIP_BODY;
	}
}

