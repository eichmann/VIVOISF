package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetReproduces extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetReproduces currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetReproduces.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetReproducesIterator theDatasetReproducesIterator = (DatasetReproducesIterator)findAncestorWithClass(this, DatasetReproducesIterator.class);
			pageContext.getOut().print(theDatasetReproducesIterator.getReproduces());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

