package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetGDPUnitIterator theDataset = (DatasetGDPUnitIterator)findAncestorWithClass(this, DatasetGDPUnitIterator.class);
			pageContext.getOut().print(theDataset.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

