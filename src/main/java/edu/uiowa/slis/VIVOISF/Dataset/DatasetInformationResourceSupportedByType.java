package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetInformationResourceSupportedByIterator theDatasetInformationResourceSupportedByIterator = (DatasetInformationResourceSupportedByIterator)findAncestorWithClass(this, DatasetInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theDatasetInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

