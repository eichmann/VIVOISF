package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Dataset theDataset = (Dataset)findAncestorWithClass(this, Dataset.class);
			if (!theDataset.commitNeeded) {
				pageContext.getOut().print(theDataset.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			Dataset theDataset = (Dataset)findAncestorWithClass(this, Dataset.class);
			return theDataset.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing Dataset for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			Dataset theDataset = (Dataset)findAncestorWithClass(this, Dataset.class);
			theDataset.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for abbreviation tag ");
		}
	}
}

