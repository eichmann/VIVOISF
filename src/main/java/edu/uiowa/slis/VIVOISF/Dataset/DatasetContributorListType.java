package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetContributorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetContributorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetContributorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetContributorListIterator theDatasetContributorListIterator = (DatasetContributorListIterator)findAncestorWithClass(this, DatasetContributorListIterator.class);
			pageContext.getOut().print(theDatasetContributorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

