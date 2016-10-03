package edu.uiowa.slis.VIVOISF.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesNumVolumes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeriesNumVolumes currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesNumVolumes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SeriesNumVolumesIterator theSeries = (SeriesNumVolumesIterator)findAncestorWithClass(this, SeriesNumVolumesIterator.class);
			pageContext.getOut().print(theSeries.getNumVolumes());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for numVolumes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for numVolumes tag ");
		}
		return SKIP_BODY;
	}
}

