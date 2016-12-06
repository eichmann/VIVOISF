package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetRank currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetRankIterator theDataset = (DatasetRankIterator)findAncestorWithClass(this, DatasetRankIterator.class);
			pageContext.getOut().print(theDataset.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for rank tag ");
		}
		return SKIP_BODY;
	}
}

