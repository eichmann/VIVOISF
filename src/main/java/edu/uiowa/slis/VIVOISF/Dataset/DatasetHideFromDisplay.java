package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Dataset theDataset = (Dataset)findAncestorWithClass(this, Dataset.class);
			if (!theDataset.commitNeeded) {
				pageContext.getOut().print(theDataset.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			Dataset theDataset = (Dataset)findAncestorWithClass(this, Dataset.class);
			return theDataset.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing Dataset for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			Dataset theDataset = (Dataset)findAncestorWithClass(this, Dataset.class);
			theDataset.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for hideFromDisplay tag ");
		}
	}
}

