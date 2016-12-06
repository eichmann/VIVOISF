package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetUrlIterator theDataset = (DatasetUrlIterator)findAncestorWithClass(this, DatasetUrlIterator.class);
			pageContext.getOut().print(theDataset.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for url tag ");
		}
		return SKIP_BODY;
	}
}

