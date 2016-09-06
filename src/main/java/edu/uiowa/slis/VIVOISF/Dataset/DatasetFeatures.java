package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetFeatures extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetFeatures.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetFeaturesIterator theDatasetFeaturesIterator = (DatasetFeaturesIterator)findAncestorWithClass(this, DatasetFeaturesIterator.class);
			pageContext.getOut().print(theDatasetFeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for features tag ");
		}
		return SKIP_BODY;
	}
}

