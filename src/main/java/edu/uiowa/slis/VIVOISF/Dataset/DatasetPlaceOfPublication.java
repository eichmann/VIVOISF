package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Dataset theDataset = (Dataset)findAncestorWithClass(this, Dataset.class);
			if (!theDataset.commitNeeded) {
				pageContext.getOut().print(theDataset.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			Dataset theDataset = (Dataset)findAncestorWithClass(this, Dataset.class);
			return theDataset.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing Dataset for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			Dataset theDataset = (Dataset)findAncestorWithClass(this, Dataset.class);
			theDataset.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for placeOfPublication tag ");
		}
	}
}

