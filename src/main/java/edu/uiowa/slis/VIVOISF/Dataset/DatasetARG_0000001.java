package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetARG_0000001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetARG_0000001 currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetARG_0000001.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetARG_0000001Iterator theDataset = (DatasetARG_0000001Iterator)findAncestorWithClass(this, DatasetARG_0000001Iterator.class);
			pageContext.getOut().print(theDataset.getARG_0000001());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for ARG_0000001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for ARG_0000001 tag ");
		}
		return SKIP_BODY;
	}
}

