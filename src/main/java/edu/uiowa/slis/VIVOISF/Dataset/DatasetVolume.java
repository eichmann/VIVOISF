package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetVolumeIterator theDataset = (DatasetVolumeIterator)findAncestorWithClass(this, DatasetVolumeIterator.class);
			pageContext.getOut().print(theDataset.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for volume tag ");
		}
		return SKIP_BODY;
	}
}

