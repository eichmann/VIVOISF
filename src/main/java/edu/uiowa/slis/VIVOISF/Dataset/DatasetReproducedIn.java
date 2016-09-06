package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetReproducedIn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetReproducedIn currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetReproducedIn.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetReproducedInIterator theDatasetReproducedInIterator = (DatasetReproducedInIterator)findAncestorWithClass(this, DatasetReproducedInIterator.class);
			pageContext.getOut().print(theDatasetReproducedInIterator.getReproducedIn());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

