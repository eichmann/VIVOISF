package edu.uiowa.slis.VIVOISF.ConferenceSeries;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceSeriesBFO_0000055 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceSeriesBFO_0000055 currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceSeriesBFO_0000055.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferenceSeriesBFO_0000055Iterator theConferenceSeriesBFO_0000055Iterator = (ConferenceSeriesBFO_0000055Iterator)findAncestorWithClass(this, ConferenceSeriesBFO_0000055Iterator.class);
			pageContext.getOut().print(theConferenceSeriesBFO_0000055Iterator.getBFO_0000055());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferenceSeries for BFO_0000055 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferenceSeries for BFO_0000055 tag ");
		}
		return SKIP_BODY;
	}
}

